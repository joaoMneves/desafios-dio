import java.time.LocalDate;

/**
 * Mentorias
 */
public class Mentorias extends Conteudo {
  private LocalDate data;

  @Override
  public double calcularXP() {
    return XP_PADRAO * 20d;
  }

  public Mentorias() {
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

}
