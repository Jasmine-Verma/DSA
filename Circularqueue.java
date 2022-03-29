// DELETE EVEN ELEMENTS FROM CIRCULAR QUEU //
class CQ{
	int rear, front, max= 100; 
	int[] a = new int[max];
	CQ() {
rear= -1;
front=-1;
}

Boolean isFull() {
if (front == 0 && rear== max - 1 11 front == rear + 1) { return true;
} else {
return false;
}
}


}