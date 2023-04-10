package model;

import java.util.Date;

public class FinanceiroMedicoDAO {
	private FinanceiroMedico[] dados = new FinanceiroMedico[50];
    private int indice = 0;

    public void cadastrar(FinanceiroMedico financeiro) {
        dados[indice] = financeiro;
        indice++;
    }

    public void atualizar(FinanceiroMedico financeiro) {
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

    public FinanceiroMedico[] buscarTodas() {
        return dados;
    }

    public FinanceiroMedico buscarPorId(int id) {
        for (int i = 0; i < indice; i++) {
            if (dados[i].getId() == id) {
                return dados[i];
            }
        }
        return null;
    }

    public double calcularValorPagoMedico(Medico medico, Date inicio, Date fim) {
        double valorTotal = 0.0;
        for (int i = 0; i < indice; i++) {
            if (dados[i].getEstado().equals("pago") &&
                    dados[i].getDataCriacao().after(inicio) &&
                    dados[i].getDataCriacao().before(fim)) {
                if (dados[i].getDescritivoMovimento().equals("consulta") &&
                        dados[i].getMedico().equals(medico)) {
                    valorTotal += dados[i].getValorMedico() * 0.7;
                } else if (dados[i].getDescritivoMovimento().equals("procedimento") &&
                        dados[i].getMedico().equals(medico)) {
                	 valorTotal += dados[i].getValorMedico() * 0.5;
                }
            }
        }
        return valorTotal;
}
    }
