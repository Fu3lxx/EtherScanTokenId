
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("blockNumber")
    @Expose
    private String blockNumber;
    @SerializedName("timeStamp")
    @Expose
    private String timeStamp;
    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("nonce")
    @Expose
    private String nonce;
    @SerializedName("blockHash")
    @Expose
    private String blockHash;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("contractAddress")
    @Expose
    private String contractAddress;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("tokenID")
    @Expose
    private String tokenID;
    @SerializedName("tokenName")
    @Expose
    private String tokenName;
    @SerializedName("tokenSymbol")
    @Expose
    private String tokenSymbol;
    @SerializedName("tokenDecimal")
    @Expose
    private String tokenDecimal;
    @SerializedName("transactionIndex")
    @Expose
    private String transactionIndex;
    @SerializedName("gas")
    @Expose
    private String gas;
    @SerializedName("gasPrice")
    @Expose
    private String gasPrice;
    @SerializedName("gasUsed")
    @Expose
    private String gasUsed;
    @SerializedName("cumulativeGasUsed")
    @Expose
    private String cumulativeGasUsed;
    @SerializedName("input")
    @Expose
    private String input;
    @SerializedName("confirmations")
    @Expose
    private String confirmations;

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTokenID() {
        return tokenID;
    }

    public void setTokenID(String tokenID) {
        this.tokenID = tokenID;
    }

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public String getTokenSymbol() {
        return tokenSymbol;
    }

    public void setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
    }

    public String getTokenDecimal() {
        return tokenDecimal;
    }

    public void setTokenDecimal(String tokenDecimal) {
        this.tokenDecimal = tokenDecimal;
    }

    public String getTransactionIndex() {
        return transactionIndex;
    }

    public void setTransactionIndex(String transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    public String getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }

    public String getCumulativeGasUsed() {
        return cumulativeGasUsed;
    }

    public void setCumulativeGasUsed(String cumulativeGasUsed) {
        this.cumulativeGasUsed = cumulativeGasUsed;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(String confirmations) {
        this.confirmations = confirmations;
    }

}