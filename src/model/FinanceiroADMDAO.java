package model;

public class FinanceiroADMDAO {
	private FinanceiroADM[] dados = new FinanceiroADM[50];
    private int indice = 0;

    public void cadastrar(FinanceiroADM financeiro) {
        dados[indice] = financeiro;
        indice++;
    }


    public void atualizar(FinanceiroADM financeiro) {
        for (int i = 0; i < indice; i++) {
            if (dados[i].getId() == financeiro.getId()) {
                dados[i] = financeiro;
                break;
            }
        }
    }

   
    public void excluir(int id) {
        for (int i = 0; i < indice; i++) {
            if (dados[i].getId() == id) {
                for (int j = i; j < indice - 1; j++) {
                    dados[j] = dados[j + 1];
                }
                indice--;
                break;
            }
        }
    }

  
    public FinanceiroADM[] buscarTodos() {
        return dados;
    }

   
    public FinanceiroADM buscarPorId(int id) {
        for (int i = 0; i < indice; i++) {
            if (dados[i].getId() == id) {
                return dados[i];
            }
        }
        return null;
    }

}
