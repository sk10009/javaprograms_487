class IPDefang {
    public String defangIPaddr(String address) {
        return address.replace("." , "[.]");
    }
}
