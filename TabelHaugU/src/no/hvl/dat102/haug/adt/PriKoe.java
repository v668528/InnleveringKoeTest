package no.hvl.dat102.haug.adt;

import java.util.Scanner;

import no.hvl.dat102.haug.tabell.TabellHaug;
public class PriKoe<T extends Comparable <T>> {
// (Alternativ til lærebok kap. 12.2)
// Implementerer prioritetskø vha en haug
// Prioritet er det vi tester på i compareTo-metoden
// Objekt med like prioritetsverdier kan bli
// tatt ut i vilkårlig rekkefølge
//
 private TabellHaug<T> koe;
 
 public PriKoe(){
  koe = new TabellHaug<T>();
 }
 
 public void leggTilElement(T el){
  koe.leggTilElement(el);
 }
 
 public T hentNeste(){
  return koe.fjernMinste();
 }
 
 public boolean erTom(){
  return koe.erTom();
 }
}

