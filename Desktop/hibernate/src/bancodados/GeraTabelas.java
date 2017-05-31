package bancodados;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
//Esta classe cria um SchemaExport

public class GeraTabelas {

    public static void main(String[] args) {
        // Cria uma configuracao para a classe Produto
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.addAnnotatedClass(Produto.class);
        //..poderia adicionar outras classes...
        //params (ver o sql?, sql deve persistir no banco?)
        new SchemaExport(cfg).create(true, true);
    }
}
