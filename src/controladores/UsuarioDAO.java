/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;


import java.util.List;
import objetos.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Marlo
 */
public class UsuarioDAO {
    Session sessao;
    Transaction transacao;
    
    public void criarSessao(){
        //método para criar seção em todos os metodos psoteriores
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
    }
    
    public void salvarUsuario(Usuario usuario){
        criarSessao();
        sessao.save(usuario);
        transacao.commit();
        sessao.close();
    }
    
        public void editarUsuario(Usuario usuario){
        criarSessao();
        sessao.update(usuario);
        transacao.commit();
        sessao.close();
    }
        
        public void excluirUsuario(Usuario usuario){
        criarSessao();
        sessao.delete(usuario);
        transacao.commit();
        sessao.close();
    }
        public List<Usuario> listarUsuario(){
            criarSessao();
            List<Usuario> usuarios = sessao.createCriteria(Usuario.class).list();
            sessao.close();
            return usuarios;
        }
        
        public Usuario pesquisarUsuarioPorId(int id){
            criarSessao();
            Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("id", id)).uniqueResult();
            sessao.close();
            return usuario;
        }
}
