package com.example.designpatterns.iterator;

import java.util.Iterator;

interface Menu {
    Iterator<MenuItem> createIterator();
}
