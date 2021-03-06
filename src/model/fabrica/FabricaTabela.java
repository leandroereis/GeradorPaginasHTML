package model.fabrica;

import model.tags.tag_tabela.Tabela;
import model.tags.tag_tabela.TabelaLinha;

public class FabricaTabela {
    /*Fábrica responsável pela gerência das tabelas, adicionando cabeçalho e detalhe das tabelas*/
    private Tabela tabela;
    private TabelaLinha tabelaLinha;

    public FabricaTabela(){
        this.tabela = new Tabela("table");
        this.tabelaLinha = new TabelaLinha("tr");
    }
    public TabelaLinha getTabelaLinha(String conteudo){
        return this.tabelaLinha;
    }
    public Tabela getTabela(){
        return tabela;
    }

}
