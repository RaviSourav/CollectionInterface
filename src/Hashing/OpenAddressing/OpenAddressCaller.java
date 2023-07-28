package Hashing.OpenAddressing;

public class OpenAddressCaller {
    public static void main(String[] args) {
        OpenAddressimpl openAddressimpl = new OpenAddressimpl(7);
        openAddressimpl.insert(35);
        openAddressimpl.insert(55);
        openAddressimpl.insert(45);
        openAddressimpl.insert(48);
        openAddressimpl.insert(16);
        openAddressimpl.insert(62);

        System.out.println(openAddressimpl.arr);
        for (int a:openAddressimpl.arr) {
            System.out.print(a+" ");
        }
        System.out.println();

        System.out.println(openAddressimpl.search(48));
        System.out.println(openAddressimpl.search(55));
        System.out.println(openAddressimpl.search(62));
        System.out.println(openAddressimpl.search(16));
        System.out.println(openAddressimpl.search(35));

    }
}
