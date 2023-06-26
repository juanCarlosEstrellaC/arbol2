package com.funcional.lista;

// Hoja sin valor y sin iz/der
public final class NodoHoja<T> implements ArbolBinario<T> {

    protected NodoHoja() { 
    }

    @Override
    public T getValor() {
        return null;
    }

    @Override
    public ArbolBinario<T> getIzquierdo() {
        return null;
    }

    @Override
    public ArbolBinario<T> getDerecho() {
        return null;
    }

    @Override
    public boolean esHoja() {
        return true;
    }
    
    @Override
    public String toString() {
        return "HOJA";
    }
}
