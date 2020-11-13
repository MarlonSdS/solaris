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
public class EmpresaTableModel extends AbstractTableModel {

    private List<Empresa> empresas = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "Endereço", "Telefone", "Email"};

    public EmpresaTableModel(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    @Override
    public int getRowCount() {
        return empresas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empresa empresa = empresas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return empresa.getId();
            case 1:
                return empresa.getNomeEmpresa();
            case 2:
                return empresa.getEnderecoEmpresa();
            case 3:
                return empresa.getTelefoneEmpresa();
            case 4:
                return empresa.getEmailEmpresa();

        }
        return null;

    }

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
            case 4:
                return colunas[4];
        }
        return null;

    }

}
