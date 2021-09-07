## GalaxyNetWork(GNC) WEB3J

### Notice
* 1.The address showed to users shall keep the prefix with 'GNC';
* 2.Before calling the Galaxy Network RPC interface, please replace the transfer address prefix 'GNC' entered by users with '0x'

###Show to users:
```java
    import org.web3j.crypto.Credentials;

    public class Address {
        public static void main(String[] args) {
            Credentials keys = Credentials.create(ECKeyPair.create(privateKeyInDec));
            // 0x6bacec0a630a53fdbae5f1f10bf87fe2b422eec1  -> GNC6bacec0a630a53fdbae5f1f10bf87fe2b422eec1
            String address = keys.getAddress().replace("0x","GNC");
        }
    }
```

###User input:
```java
    public class Balance {
        public static void main(String[] args){
            //user input GNC address
            String fromAddress = "GNC7d4ed9084A364424d1087d26C4Ef092EAfB0b395";
            //GNC7d4ed9084A364424d1087d26C4Ef092EAfB0b395 -> 0x7d4ed9084A364424d1087d26C4Ef092EAfB0b395
            fromAddress = fromAddress.replace("GNC","0x");
            //Call RPC ...
            BigInteger b=web3j.ethGetBalance(fromAddress, DefaultBlockParameterName.LATEST).send().getBalance();
            //......
        }
    }
 
```