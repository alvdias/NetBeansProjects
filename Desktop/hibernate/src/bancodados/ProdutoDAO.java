package bancodados;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProdutoDAO {

    private Session session;

    public ProdutoDAO(Session session) {
        this.session = session;
    }

    // este metodo pode cair em prova
    public void salva(Produto p) {
        //cria transação
        Transaction tx = this.session.beginTransaction();
        // salva produto
        this.session.save(p);
        //finaliza a transação
        //persiste do buffer para o banco
        tx.commit();
    }

    public void remove(Produto p) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(p);
        tx.commit();
    }

    public void atualiza(Produto p) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(p);
        tx.commit();
    }

    public Produto procura(Long id) {
        return (Produto) this.session.load(Produto.class, id);
    }

    public List<Produto> listaTudo() {
        //baseado no criterio da classe produto cria 
        return this.session.createCriteria(Produto.class).list();
    }

    public List<Produto> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Produto.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio)
                .list();
    }

    public List<Produto> listaprodutos(Long id) {
        return session.createQuery("FROM Produto WHERE id > " + id).list();
    }

    public List<Produto> listaprodutosSQL(String sql) {
        return session.createSQLQuery(sql)
                .addEntity(Produto.class)
                .list();
    }
}
