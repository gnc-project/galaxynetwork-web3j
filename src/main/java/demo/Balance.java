package demo;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.http.HttpService;
import org.web3j.utils.Convert;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class Balance {

    static String fromAddress = "GNC7d4ed9084A364424d1087d26C4Ef092EAfB0b395";
//    static String url = "http://chain-node.galaxynetwork.vip/";
    static String url = "http://14.116.138.103:8545/";
//    static HashMap<String,String> hashMap = new HashMap<>();

    public static void main(String[] args) throws IOException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        Web3j web3j = Web3j.build(new HttpService(url));

        fromAddress = fromAddress.replace("GNC","0x");
        BigInteger b=web3j.ethGetBalance(fromAddress, DefaultBlockParameterName.LATEST).send().getBalance();
        BigDecimal bigDecimal = Convert.fromWei(new BigDecimal(b),Convert.Unit.ETHER);
        System.out.println("---->"+"address "+fromAddress+"  "  +bigDecimal);

    }
}

//
//        for (int i = 0; i < 10000 ; i++) {
//            ECKeyPair ecKeyPair = Keys.createEcKeyPair();
//            BigInteger privateKeyInDec = ecKeyPair.getPrivateKey();
//            Credentials keys = Credentials.create(ECKeyPair.create(privateKeyInDec));
//            String privateKey = Hex.toHexString(keys.getEcKeyPair().getPrivateKey().toByteArray());
//            String address = keys.getAddress().replace("0x","GNC");
//            hashMap.put(address,privateKey);
//        }

//        Date date1 = new Date();
//        for(String key : hashMap.keySet()){
////            System.out.println("address:"+key+"  privateKey:"+hashMap.get(key));
//
//
////            System.out.println("---->"+"address"+key+"  "  +bigDecimal);
//        }
//
//
//        Date date2 = new Date();
//        System.out.println(date2.getTime()-date1.getTime());
