package Searching;

class VersionControl {
    private int firstBadVersion;

    public VersionControl(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }

    public boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }
}

public class FirstBadVersion extends VersionControl {

    public FirstBadVersion(int firstBadVersion) {
        super(firstBadVersion);
    }

    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int n = 5;
        int firstBad = 4;
        FirstBadVersion solution = new FirstBadVersion(firstBad);
        int result = solution.firstBadVersion(n);
        System.out.println("The first bad version is: " + result);
    }
}
