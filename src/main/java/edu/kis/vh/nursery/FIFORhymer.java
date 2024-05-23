package edu.kis.vh.nursery;

private class FIFORhymer extends defaultCountingOutRhymer {

    private final defaultCountingOutRhymer tempRhymer = new defaultCountingOutRhymer();
    
    @Override
    public int countOut() {
        while (!callCheck())
            
        tempRhymer.countIn(super.countOut());
        
        int ret = tempRhymer.countOut();
        
        while (!tempRhymer.callCheck())a
            
        countIn(tempRhymer.countOut());
        
        return ret;
    }
}
