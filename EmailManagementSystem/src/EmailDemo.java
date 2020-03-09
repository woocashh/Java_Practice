public class EmailDemo {

  public static void main(String[] args) {

    GroupEmail multicoreProgrammingGroup = new GroupEmail("multicore@doc.ic.ac.uk");

    multicoreProgrammingGroup.addEmail(new IndividualEmailAddress("afd@doc.ic.ac.uk"));
    multicoreProgrammingGroup.addEmail(new IndividualEmailAddress("abetts@doc.ic.ac.uk"));
    multicoreProgrammingGroup.addEmail(new IndividualEmailAddress("pt1110@doc.ic.ac.uk"));

    GroupEmail softwarePerformanceOptimizationGroup = new GroupEmail(
        "spo@doc.ic.ac.uk");
    softwarePerformanceOptimizationGroup
        .addEmail(new IndividualEmailAddress("phjk@doc.ic.ac.uk"));
    softwarePerformanceOptimizationGroup
        .addEmail(new IndividualEmailAddress("abetts@doc.ic.ac.uk"));
    softwarePerformanceOptimizationGroup
        .addEmail(new IndividualEmailAddress("nchong@doc.ic.ac.uk"));

    softwarePerformanceOptimizationGroup.addEmail(multicoreProgrammingGroup);

    // creates a cycle
    multicoreProgrammingGroup.addEmail(softwarePerformanceOptimizationGroup);

    IndividualEmailAddress wayne = new IndividualEmailAddress("wayne@doc.ic.ac.uk");

    GroupEmail computerSystemsGroup = new GroupEmail("cosys@doc.ic.ac.uk");
    computerSystemsGroup.addEmail(wayne);
    computerSystemsGroup.addEmail(multicoreProgrammingGroup);
    computerSystemsGroup.addEmail(softwarePerformanceOptimizationGroup);

    System.out.println("All members of Computer Systems group: "
        + computerSystemsGroup.getTargets());

    System.out.println("All members of Multicore Programming group: "
        + multicoreProgrammingGroup.getTargets());

    System.out.println("All members of SPO group: "
        + softwarePerformanceOptimizationGroup.getTargets());

    System.out.println("An email to Wayne should simply go to "
        + wayne.getTargets());

  }

}