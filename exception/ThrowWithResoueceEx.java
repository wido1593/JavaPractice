package exception;

public class ThrowWithResoueceEx {
	public static void main(String args[]) {
		try (CloseableResource cr = new CloseableResource())
		{
			cr.exceptionWork(false);
		} catch (WorkException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		catch (CloseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println();
		
		
		try (CloseableResource cr = new CloseableResource())
		{
			cr.exceptionWork(true);
		} catch (WorkException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		catch (CloseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}



class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException{
		System.out.println("exceptionWork("+exception+")�� ȣ���");
		
		if(exception) {
			throw new WorkException("WorkException�߻�!!");
		}
	}

	@Override
	public void close() throws CloseException {
		// TODO Auto-generated method stub
		System.out.println("close()�� ȣ���");
		throw new CloseException("CloseException�߻�");
	}
}

class WorkException extends Exception {
	WorkException(String msg) { 
		super(msg);
	}
}

class CloseException extends Exception {
	CloseException(String msg) { 
		super(msg);
	}
}