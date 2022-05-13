public class Pilhas {
    NoPilhas refNoEntradaPilhas = null;     // ref = referências; No = nó!

    public void push(NoPilhas novoNo){      //criando o método push

        NoPilhas refAuxiliar = refNoEntradaPilhas;
        refNoEntradaPilhas = novoNo;
        refNoEntradaPilhas.setReferenciaNoPilhas(refAuxiliar);
    }

    public NoPilhas pop(){          // criando o método pop
        if(!isEmpty()){
            NoPilhas noPoped = refNoEntradaPilhas;
            refNoEntradaPilhas = refNoEntradaPilhas.getReferenciaNoPilhas();
            return noPoped;
        }
        return null;
    }

    public NoPilhas topo(){
        return refNoEntradaPilhas;
    }

    private boolean isEmpty() {
        return refNoEntradaPilhas == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        NoPilhas noAuxiliar = refNoEntradaPilhas;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNoPilhas();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
