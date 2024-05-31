package celio.edu.set.operacoes_basicas.conjunto_palavras_unicas;

public class Palavra {
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return "Palavra [palavra=" + palavra + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavra == null) ? 0 : palavra.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Palavra other = (Palavra) obj;
        if (palavra == null) {
            if (other.palavra != null)
                return false;
        } else if (!palavra.equals(other.palavra))
            return false;
        return true;
    }

    
}
