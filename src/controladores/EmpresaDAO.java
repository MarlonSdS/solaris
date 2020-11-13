/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import objetos.Empresa;
import objetos.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Marlo
 */
public class EmpresaDAO {
    Session sessao;
    Transaction transacao;
    
    public void criarSessao(){
        //método para criar seção em todos os metodos psoteriores
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
    }
    
    public void salvarEmpresa(Empresa empresa){
        criarSessao();
        sessao.save(empresa);
        transacao.commit();
        sessao.close();
    }
    
        public void editarEmpresa(Empresa empresa){
        criarSessao();
        sessao.update(empresa);
        transacao.commit();
        sessao.close();
    }
        
        public void excluirEmpresa(Empresa empresa){
        criarSessao();
        sessao.delete(empresa);
        transacao.commit();
        sessao.close();
    }
        public List<Empresa> listarEmpresa(){
            criarSessao();
            List<Empresa> empresas = sessao.createCriteria(Empresa.class).list();
            sessao.close();
            return empresas;
        }
        public Empresa pesquisarEmpresaPorId(int id){
            criarSessao();
            Empresa empresa = (Empresa) sessao.createCriteria(Empresa.class).add(Restrictions.eq("id", id)).uniqueResult();
            sessao.close();
            return empresa;
        }
}
