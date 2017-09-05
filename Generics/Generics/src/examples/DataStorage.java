package examples;

//you can declare that a generic type uses a class or interface
public class DataStorage<T> //<T extends Robot><T extends Breakable>
{
	private T data;

	public DataStorage(T data)
	{
		this.data = data;
		
		//cannot instantiate type T
		//this.data = new T();
		
		//cannot create a generic array of T
		//T[] array = new T[10];
	}

	public T getData()
	{
		return data;
	}

	public void setData(T data)
	{
		this.data = data;
	}
}
