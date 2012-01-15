#-*- coding: cp1254 -*-
def yol_secici(x,y,z):
    if x==0 and y==0 and z==0 :
        print "a: 0\nb: 0\nc: 0\nd: 0\ne: 0\nf: 0\ng: 0"
    elif x==0 and y==0 and z==1 :
        print "a: 1\nb: 0\nc: 0\nd: 0\ne: 0\nf: 0\ng: 0"
    elif x==0 and y==1 and z==0 :
        print "a: 0\nb: 1\nc: 0\nd: 0\ne: 0\nf: 0\ng: 0"
    elif x==0 and y==1 and z==1 :
        print "a: 0\nb: 0\nc: 1\nd: 0\ne: 0\nf: 0\ng: 0"
    elif x==1 and y==0 and z==0 :
        print "a: 0\nb: 0\nc: 0\nd: 1\ne: 0\nf: 0\ng: 0"
    elif x==1 and y==0 and z==1 :
        print "a: 0\nb: 0\nc: 0\nd: 0\ne: 1\nf: 0\ng: 0"
    elif x==1 and y==1 and z==0 :
        print "a: 0\nb: 0\nc: 0\nd: 0\ne: 0\nf: 1\ng: 0"
    elif x==1 and y==1 and z==1 :
        print "a: 0\nb: 0\nc: 0\nd: 0\ne: 0\nf: 0\ng: 1"
