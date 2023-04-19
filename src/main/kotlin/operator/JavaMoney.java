package operator;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class JavaMoney implements Comparable<JavaMoney> {
    private final Integer amount;

    public JavaMoney(Integer amount) {
        this.amount = amount;
    }

    public JavaMoney plusJavaMoney(JavaMoney javaMoney) {
        return  new JavaMoney(this.amount + javaMoney.amount);
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaMoney javaMoney = (JavaMoney) o;
        return Objects.equals(amount, javaMoney.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
