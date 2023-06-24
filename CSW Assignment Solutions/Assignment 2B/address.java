import java.util.TreeMap;

class address {
    private String plotNo;
    private String at;
    private String post;

    public address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public String getAt() {
        return at;
    }

    public String getPost() {
        return post;
    }


    public static void main(String[] args) {
        // Create a TreeMap with keys as names and values as addresses
        TreeMap<String, address> addressBook = new TreeMap<>();
        // Insert some data into the TreeMap
        addressBook.put("John Doe", new address("123", "Main Street",
                "New York"));
        addressBook.put("Jane Smith", new address("456", "High Street",
                "London"));
        addressBook.put("Bob Johnson", new address("789", "Elm Street",
                "Los Angeles"));
        // Display the TreeMap
        for (String name : addressBook.keySet()) {
            address address = addressBook.get(name);
            System.out.println(name + ": Plot No. " +
                    address.getPlotNo() + ", At " + address.getAt() + ", Post " +
                    address.getPost());
        }
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public void setPost(String post) {
        this.post = post;
    }
}