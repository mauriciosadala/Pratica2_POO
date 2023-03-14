public class Calculo {
    float investInicio, meses, taxa;
    public Calculo(float investInicio, float meses, float taxa) {
        this.investInicio = investInicio;
        this.meses = meses;
        this.taxa = taxa;
    }

    public float rendimento(){
        float resultado = (((taxa/100)*meses)*investInicio);
        return resultado;


    }

    public float getInvestInicio() {
        return investInicio;
    }

    public void setInvestInicio(float investInicio) {
        this.investInicio = investInicio;
    }

    public float getMeses() {
        return meses;
    }

    public void setMeses(float meses) {
        this.meses = meses;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
}
