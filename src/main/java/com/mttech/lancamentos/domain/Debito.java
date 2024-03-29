package com.mttech.lancamentos.domain;

public class Debito extends Lancamento {

    Debito() {
        setTipo(TipoLancamentoEnum.DEBITO.toString());
    }

    @Override
    public void setValor(Double valor) throws Exception {
        if (valor <= 0)
            throw new IllegalArgumentException("O valor do débito não pode ser menor ou igual a zero");
        super.setValor(valor);
    }

}
