package pp.block6.cc.func;

import java.util.Stack;

/** Store for name declarations.
 * A newly constructed {@link SymbolTable} should consist of a single
 * (outer) scope. 
 */
public class SymbolTable {
	/** Stack of name-to-type maps. */
	private final Stack<Scope> scopes;

	/** Constructs a fresh, initially empty symbol table. */
	public SymbolTable() {
		this.scopes = new Stack<>();
		openScope();
	}
	/** Adds a next deeper scope level. */
	public void openScope() {
		this.scopes.push(new Scope());
	}

	/** Removes the deepest scope level.
	 * @throws RuntimeException if the table only contains the outer scope.
	 */
	public void closeScope() {
		if (this.scopes.size() == 1) {
			throw new IllegalStateException("Can't close outer scope");
		}
		this.scopes.pop();
	}

	/** Tries to declare a given identifier in the deepest scope level.
	 * @return <code>true</code> if the identifier was added,
	 * <code>false</code> if it was already declared in this scope.
	 */
	public boolean put(String id, Type record) {
		return this.scopes.peek().put(id, record);
	}

	/** Looks up a given identifier and returns the associated type.
	 * @return the record associated with the inner (deepest) declaration
	 * of the identifier; {@code null} if there is none.
	 */
	public Type type(String id) {
		Type result = null;
		for (int i = this.scopes.size() - 1; result == null && i >= 0; i--) {
			result = this.scopes.get(i).type(id);
		}
		return result;
	}

	/** Returns the (relative) depth at which an identifier was declared.
	 * @return The depth at which {@code id} was declared ({@code 0} being
	 * the current level), or {@code -1} if {@code id} was not declared.
	 */
	public int depth(String id) {
		int result = -1;
		for (int i = this.scopes.size() - 1; result < 0 && i >= 0; i--) {
			if (this.scopes.get(i).contains(id)) {
				result = this.scopes.size() - 1 - i;
			}
		}
		return result;
	}

	/** Returns the offset of an identifier within its own scope. The
	 * offset is the sum of the sizes of all types declared before the 
	 * identifier.
	 * @return The offset at which {@code id} was declared, or {@code -1}
	 * if it was not declared.
	 */
	public int offset(String id) {
		Integer result = null;
		for (int i = this.scopes.size() - 1; result == null && i >= 0; i--) {
			result = this.scopes.get(i).offset(id);
		}
		return result == null ? -1 : result;
	}
}
