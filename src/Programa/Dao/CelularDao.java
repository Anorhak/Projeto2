package Programa.Dao;

import Programa.Entidades.Celular;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CelularDao extends Dao {

    PreparedStatement sql;
    ResultSet rs;

    public void inserir(Celular cel) throws SQLException {
        try {
            con = getConnection();
            sql = con.prepareStatement("Insert into TbCelular values (null,?,?)");
            sql.setString(1, cel.getMarca());
            sql.setString(2, cel.getModelo());
            sql.execute();
        } catch (Exception ex) {
            ex.getMessage();
        } finally {
            sql.close();
            con.close();
        }
    }

    public void alterar(String atributo, int cd, String novovalor) throws SQLException {
        try {
            con = getConnection();
            sql = con.prepareStatement("Update tbcelular set "+atributo+"= ? Where cdcelular = ?");
            sql.setString(1, novovalor);
            sql.setInt(2, cd);
            sql.execute();
        } catch (Exception ex) {
            Logger.getLogger(CelularDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            sql.close();
            con.close();
        }
    }

    public ArrayList<Celular> pesquisarCodigo(int Cd) throws SQLException {
        ArrayList<Celular> lista = new ArrayList();
        try {
            con = getConnection();
            sql = con.prepareStatement("Select * from TbCelular Where not CdCelular=0");
            sql.execute();
            rs = sql.getResultSet();
            while (rs.next()) {
                lista.add(new Celular(rs.getString("NmModelo"), rs.getString("NmMarca"), rs.getInt("CdCelular")));
            }
        } catch (Exception ex) {
            Logger.getLogger(CelularDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            sql.close();
            con.close();
        }
        return lista;
    }

    public void excluir(int cd) throws SQLException {
        try {
            con = getConnection();
            sql = con.prepareStatement("Delete From TbCelular where CdCelular=" + cd);
            sql.execute();
        } catch (Exception ex) {
            Logger.getLogger(CelularDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            sql.close();
            con.close();
        }
    }

    public boolean criarCelular(Celular exemplo) {
        boolean r = false;
        for (int i = 0; i <= vcel.length; i++) {
            if (vcel[i] == null) {
                vcel[i] = exemplo;
                r = true;
            } else {
                r = false;
            }
        }
        return r;
    }

    public Celular pesquisarcd(int cd) {
        for (int i = 0; i <= vcel.length; i++) {
            if (vcel[i].getCd() == cd) {
                aux = vcel[i];
            }
        }
        return aux;
    }

    public ArrayList<Celular> pesquisarmarca(Celular exemplo) {
        for (int i = 0; i <= vcel.length; i++) {
            if (vcel[i].getMarca().equalsIgnoreCase(exemplo.getMarca())) {
                listacel.add(vcel[i]);
            }

        }
        return listacel;
    }

    public void editarMarca(int cd, String marca) {
        for (int i = 0; i < vcel.length; i++) {
            if (vcel[i].getCd() == cd) {
                vcel[i].setMarca(marca);
            }
        }
    }

    public void editarModelo(int cd, String modelo) {
        for (int i = 0; i < vcel.length; i++) {
            if (vcel[i].getCd() == cd) {
                vcel[i].setModelo(modelo);
            }
        }

    }

    public void excluirOld(int cd) {
        for (int i = 0; i < vcel.length; i++) {
            if (vcel[i].getCd() == cd) {
                vcel[i] = null;
            }
        }
    }

    static Celular[] vcel = new Celular[5];
    static ArrayList<Celular> listacel = new ArrayList();
    static Celular aux = new Celular();

}
