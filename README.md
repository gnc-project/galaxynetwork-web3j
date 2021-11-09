## GalaxyNetWork(GNC) WEB3J

### Notice
* 1.Replace the old address prefix 'GNC' with '0x'
* 2.Keep the RPC/API same with Ethereum v1.10.8
* 3.Block Number starts from 0
### Show to users:
```java
    import org.web3j.crypto.Credentials;

    public class Address {
        public static void main(String[] args) {
            Credentials keys = Credentials.create(ECKeyPair.create(privateKeyInDec));
            // 0x6bacec0a630a53fdbae5f1f10bf87fe2b422eec1
            String address = keys.getAddress();
        }
    }
```

### User input:
```java
    public class Balance {
        public static void main(String[] args){
            //user input GNC address
            String fromAddress = "0x7d4ed9084A364424d1087d26C4Ef092EAfB0b395";
            //Call RPC ...
            BigInteger b=web3j.ethGetBalance(fromAddress, DefaultBlockParameterName.LATEST).send().getBalance();
            //......
        }
    }
 
```