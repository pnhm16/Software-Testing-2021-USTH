Exercise-3.5 :
      RIPR model is used for effectiveness of testing process to find faults and failures in the software. RIPR is an acronym that stands for :
        R -- Reachability
        I -- Infection
        P -- Propagation
        R -- Revealability

        The reachability of the test is limited. The test only checks the first element in the list to defines the test pass or success.

        The test neglects the infection and propagation of the fault to other areas in the list. For Example, if the third and fourth elements in the list are not sorted the test would not detect and reveal the defect. So, the test fails the infection and propagation of the fault to other places of the list.

        To ensure the RIPR model, the test should assert for all the elements in the list to check if the sort() method sorts the elements as expected.