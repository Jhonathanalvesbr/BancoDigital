import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ContaTeste {

    @Test
    public void transferenciaSemSaldo() throws SaldoInsuficiente {
        Conta conta1 = new ContaCorrente(new Cliente());
        Conta conta2 = new ContaCorrente(new Cliente());

        Assertions.assertThrows(SaldoInsuficiente.class, () -> conta1.transferir(100,conta2));
    }

    @Test
    public void transferenciaSaldo() throws SaldoInsuficiente {
        Conta conta1 = new ContaCorrente(new Cliente());
        Conta conta2 = new ContaCorrente(new Cliente());

        conta1.depositar(1000);
        conta1.transferir(100,conta2);
        Assertions.assertEquals(100,conta2.getSaldo());
    }

    @Test
    public void depositarNegativo() {
        Conta conta = new ContaCorrente(new Cliente());

        conta.depositar(-1000);
        Assertions.assertEquals(0,conta.getSaldo());
    }
}
