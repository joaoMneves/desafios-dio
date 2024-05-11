/**
 * Cursos
 */
public class Cursos extends Conteudo {

  private int cargaHoraria;

  @Override
  public double calcularXP() {
    return XP_PADRAO * cargaHoraria;
  }

  public Cursos() {
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

}
