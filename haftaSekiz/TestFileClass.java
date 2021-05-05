public class TestFileClass {
    public static void main(String[] args) {
        String fileName = "filepath/file.jpg";
        java.io.File file = new java.io.File(fileName);
        System.out.println("dosya var mı ? "+file.exists());
        System.out.println("dosya "+file.length() + " byte");
        System.out.println("dosya okunabilir mi ? "+file.canRead());
        System.out.println("Dizin -> "+file.isDirectory());
        System.out.println("dosya -> "+file.isFile());
        System.out.println("Gizli mi? -> "+file.isHidden());


    }
}
