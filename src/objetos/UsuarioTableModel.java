/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gabriel
 */
public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> usuarios = new ArrayList<>();
    private String[] colunas;
    
    public UsuarioTableModel(List<Usuario> usuarios) {

    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getId();
            case 1:
                return usuario.getNomeUsuario();
            case 2:
                return usuario.getSenhaUsuario();
            case 3:
                return usuario.getLoginUsuario();

        }
        return null;

    }

    /**
     *
     * @param index
     * @return
     */
    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
        }
        return null;

    }

}
