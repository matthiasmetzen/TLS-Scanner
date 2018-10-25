package de.rub.nds.tlsscanner.report.after.prime;

import java.io.Serializable;
import java.math.BigInteger;

public class CommonDhValues implements Serializable {

    private BigInteger generator;
    private BigInteger modulus;
    private int length;
    private boolean prime;
    private boolean safePrime;
    private String name;

    public CommonDhValues(BigInteger generator, BigInteger modulus, int length, boolean prime, boolean safePrime, String name) {
        this.generator = generator;
        this.modulus = modulus;
        this.length = length;
        this.prime = prime;
        this.safePrime = safePrime;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public BigInteger getGenerator() {
        return generator;
    }

    public void setGenerator(BigInteger generator) {
        this.generator = generator;
    }

    public BigInteger getModulus() {
        return modulus;
    }

    public void setModulus(BigInteger modulus) {
        this.modulus = modulus;
    }

    public boolean isPrime() {
        return prime;
    }

    public void setPrime(boolean prime) {
        this.prime = prime;
    }

    public boolean isSafePrime() {
        return safePrime;
    }

    public void setSafePrime(boolean safePrime) {
        this.safePrime = safePrime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
