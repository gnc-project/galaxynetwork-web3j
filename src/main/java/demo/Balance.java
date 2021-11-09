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

    static String fromAddress = "0x7d4ed9084A364424d1087d26C4Ef092EAfB0b395";
//    static String url = "http://chain-node.galaxynetwork.vip/";
    static String url = "http://chain-node.galaxynetwork.vip/";
//    static HashMap<String,String> hashMap = new HashMap<>();

    public static void main(String[] args) throws IOException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        Web3j web3j = Web3j.build(new HttpService(url));
        BigInteger b=web3j.ethGetBalance(fromAddress, DefaultBlockParameterName.LATEST).send().getBalance();
        BigDecimal bigDecimal = Convert.fromWei(new BigDecimal(b),Convert.Unit.ETHER);
        System.out.println("---->"+"address "+fromAddress+"  "  +bigDecimal);

    }
}
