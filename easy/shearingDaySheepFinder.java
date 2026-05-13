/*
Your task is to find the ID of the first sheep that needs shearing based on the wool status. Iterate through the woolStatus string and compare each character to '1'. 
If a match is found, return the sheep ID at the corresponding index in the sheepIDs array. If no sheep needs shearing (i.e., no '1' is found in woolStatus), return -1.

Parameters:
sheepIDs (int[]): An array of integers representing the IDs of the sheep.
woolStatus (String): A string representing the wool status of each sheep, where '1' indicates a sheep needing shearing and '0' represents a shorn sheep.
*/

class FindFirstWoollySheep {
    public static int findFirstWoollySheep(int[] sheepIDs, String woolStatus) {
        for (int i = 0; i < woolStatus.length(); i++) {

            if (woolStatus.charAt(i) == '1') {
                return sheepIDs[i];
            }
        }

        return -1;
    }
}
