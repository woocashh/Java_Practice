public class NiNumber {

  private final String nationalInsuranceNumber;

  public NiNumber(String nationalInsuranceNumber) {
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  public String toString() {
    return "NI: " + nationalInsuranceNumber;
  }

}
