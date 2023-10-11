import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class DepositAmount {

    @Test

    void DepositAmmount(){
        BankAccount account = new BankAccount("Saima", "Miah", "October", 0, 0);

        double result = account.deposit(100);
        double expected = 100;

        assertThat(result).isEqualTo(expected);


    }


    }
}
