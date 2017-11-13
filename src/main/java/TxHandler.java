import java.util.ArrayList;


// 2017-11-12 a

public class TxHandler {

    /**
     * Creates a public ledger whose current UTXOPool (collection of unspent transaction outputs) is
     * {@code utxoPool}. This should make a copy of utxoPool by using the UTXOPool(UTXOPool uPool)
     * constructor.
     */

    private UTXOPool pool;

    public TxHandler(UTXOPool utxoPool) {
        // IMPLEMENTED
        this.pool = new UTXOPool(utxoPool);
        return;
    }

    /**
     * @return true if:
     * (1) all outputs claimed by {@code tx} are in the current UTXO pool,
     * (2) the signatures on each input of {@code tx} are valid,
     * (3) no UTXO is claimed multiple times by {@code tx},
     * (4) all of {@code tx}s output values are non-negative, and
     * (5) the sum of {@code tx}s input values is greater than or equal to the sum of its output
     *     values; and false otherwise.
     */
    public boolean isValidTx(Transaction tx) {
        // IMPLEMENTING
        boolean returnVal = false;

        ArrayList<Transaction.Output> outputs = tx.getOutputs();

        ArrayList<UTXO> utxos = pool.getAllUTXO();
        for (UTXO utxo : utxos) {

        }


	for (Transaction.Output op : outputs) {
	    // pool.contains(op);

        }


        return returnVal;
    }

    /**
     * Handles each epoch by receiving an unordered array of proposed transactions, checking each
     * transaction for correctness, returning a mutually valid array of accepted transactions, and
     * updating the current UTXO pool as appropriate.
     */
    public Transaction[] handleTxs(Transaction[] possibleTxs) {
        // IMPLEMENT THIS
        return null;
    }

}
