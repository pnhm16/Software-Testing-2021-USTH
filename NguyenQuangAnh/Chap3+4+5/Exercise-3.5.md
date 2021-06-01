*__Question:__ Find the flaw of a given testSort() method, and describe it using the RIPR model.*

*__Answer:__*
In this test, the assertion (assertTrue()) only checks
a small part of the final state (First element). However, if a test causes a fault to infect, then propagates to another part of final state, the failure will not be revealed. Because of this, the test oracle needs to look at the whole list instead of small parts of it.

