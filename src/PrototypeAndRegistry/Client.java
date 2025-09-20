package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User adminUser = new User(1,"admin","admin@test.com","Admin",30,UserType.ADMIN);
        User readerUser = new User(2,"reader","reader@test.com","Admin",30,UserType.READER);
        User writerUser = new User(3,"writer","writer@test.com","Admin",30,UserType.WRITER);
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.addPrototype(adminUser);
        userRegistry.addPrototype(writerUser);
        userRegistry.addPrototype(readerUser);

        User adminUser2 = userRegistry.clone(UserType.ADMIN);
        System.out.println(adminUser2.getUsername());
    }
}
