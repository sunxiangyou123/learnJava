package com.tcredit;

import java.util.Map;

public class RSATester {

//    static String publicKey;
//    static String privateKey;
    static String privateKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAMBIfz6ZPcoiIHtuTaq16AsN9FFktlrKWW+/Hq2gaLlezCwEmlQv1WpiwB8XwvbrmHg8dWnu1VjT8ruvgHPB817k5Vy/mfofkQrCFnS1T5/IcxQ4m7xD9pZi0uV/0xYgjmPOHGPvBo7Iy1+FNMLDc9r/HdOezmVyAJXo3LkXiXchAgMBAAECgYBEC2O8K06KcXk9NNOXTbhH8TA8fX9qsaDkwqWAm/tzXfCyww46LJNBiqCiYC5GYykZo4uJaVNmk9qaQIkcbc5JcXIJumy46pBrsEsMsBkjGjh5WW5bFP3cNdbsITZuPb1nHv9H/qfa3mGhtvk+F8sixZ995VSDinxxyexbHXfAAQJBAOO9aq1obA4G8qWn7LxowUv3rJz4jffv/OQXVs1a2g1tI8h8LA4p2gEvgaBNmMiSt9dufIeyEkSpBqjZx6ArgGECQQDYJLtFmt4U9/duCmzT1lIKytdLXsgtjLk+lnJwCPmItrLyvvXCfIYVzG8mvzGQGoITcBLz8CmB8IwWyv1eFG7BAkB0kJbxeukTpOq9b130cYm+YF6xWWcQ6H0AIhIDueSxypLuIuBJv5Id2Tr32b/BqZb/ZUXIDpTbH8iQ1CchDCMBAkEAmZzZX6mmJj7pIdLU72UFX9gzVMSi/gRib0HbSRaHygsWeQEQhs2bOgjWAjKl1eWRBqGDRs0rosbDuTtBAMkCwQJBALK5s7suF+X6evNNuuptvuVGpkhzKU6c0TMWYXlLPVjo70ufqpzYC68DZlxc0jz5fBu3T2bk+xvPvtQKY76XlR8=";
    static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDASH8+mT3KIiB7bk2qtegLDfRRZLZayllvvx6toGi5XswsBJpUL9VqYsAfF8L265h4PHVp7tVY0/K7r4BzwfNe5OVcv5n6H5EKwhZ0tU+fyHMUOJu8Q/aWYtLlf9MWII5jzhxj7waOyMtfhTTCw3Pa/x3Tns5lcgCV6Ny5F4l3IQIDAQAB";

    static {
        try {
            Map<String, Object> keyMap = RSAUtils.genKeyPair();
//            publicKey = RSAUtils.getPublicKey(keyMap);
//            privateKey = RSAUtils.getPrivateKey(keyMap);
            
            System.err.println("公钥: \n\r" + publicKey);
            System.err.println("私钥： \n\r" + privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws Exception {
//        test();
        testSign();
//        testHttpSign();
    }

    static void test() throws Exception {
        System.err.println("公钥加密——私钥解密");
        String source = "这是一行没有任何意义的文字，你看完了等于没看，不是吗？";
        System.out.println("\r加密前文字：\r\n" + source);
        byte[] data = source.getBytes();
        byte[] encodedData = RSAUtils.encryptByPublicKey(data, publicKey);
        System.out.println("加密后文字：\r\n" + new String(encodedData));
        byte[] decodedData = RSAUtils.decryptByPrivateKey(encodedData, privateKey);
        String target = new String(decodedData);
        System.out.println("解密后文字: \r\n" + target);
    }

    static void testSign() throws Exception {
        System.err.println("私钥加密——公钥解密");
        String source = "这是一行测试RSA数字签名的无意义文字";
        System.out.println("原文字：\r\n" + source);
        byte[] data = source.getBytes();
        byte[] encodedData = RSAUtils.encryptByPrivateKey(data, privateKey);
        System.out.println("加密后：\r\n" + new String(encodedData));
        byte[] decodedData = RSAUtils.decryptByPublicKey(encodedData, publicKey);
        String target = new String(decodedData);
        System.out.println("解密后: \r\n" + target);
        System.err.println("私钥签名——公钥验证签名");
        String sign = RSAUtils.sign(data, privateKey);
        System.err.println("签名:\r" + sign);
        boolean status = RSAUtils.verify(data, publicKey, sign);
        System.err.println("验证结果:\r" + status);
    }
    
    static void testHttpSign() throws Exception {
        String param = "id=1&name=张三";
        byte[] encodedData = RSAUtils.encryptByPrivateKey(param.getBytes(), privateKey);
        System.out.println("加密后：" + encodedData);
        
        byte[] decodedData = RSAUtils.decryptByPublicKey(encodedData, publicKey);
        System.out.println("解密后：" + new String(decodedData));
        
        String sign = RSAUtils.sign(encodedData, privateKey);
        System.err.println("签名：" + sign);
        
        boolean status = RSAUtils.verify(encodedData, publicKey, sign);
        System.err.println("签名验证结果：" + status);
    }
    
    
}
