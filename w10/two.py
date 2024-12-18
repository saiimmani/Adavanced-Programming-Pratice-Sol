from pyDatalog import pyDatalog

# Create terms for family relationships
pyDatalog.create_terms('X, Y, Z, Parent, Child, Sibling, Grandparent, Ancestor, Degree, Relationship, CommonAncestor, Degree2')

# Define facts for parents and children
+ Parent('John', 'Alice')
+ Parent('Mary', 'Alice')
+ Parent('John', 'Bob')
+ Parent('Mary', 'Bob')
+ Parent('Alice', 'Carol')
+ Parent('Tom', 'Carol')
+ Parent('Bob', 'Dave')
+ Parent('Jane', 'Dave')

# Rule1: Define siblings based on shared parents
Sibling(X, Y) <= (Parent(Z, X) & Parent(Z, Y) & (X != Y))

# Rule2: Define grandparents based on parent-child relationships
Grandparent(X, Y) <= (Parent(X, Z) & Parent(Z, Y))

# Rule3: Define ancestors recursively
Ancestor(X, Y) <= Parent(X, Y)
Ancestor(X, Y) <= (Parent(X, Z) & Ancestor(Z, Y))

# Rule4: Calculate degrees of relationship using recursion
Relationship(X, Y, 1) <= Parent(X, Y)
Relationship(X, Y, 1) <= Parent(Y, X)
Relationship(X, Y, Degree) <= (Parent(X, Z) & Relationship(Z, Y, Degree2) & (Degree == Degree2 + 1))
Relationship(X, Y, Degree) <= (Parent(Y, Z) & Relationship(Z, X, Degree2) & (Degree == Degree2 + 1))

# Find common ancestors between two people
CommonAncestor(X, Y, Z) <= (Ancestor(Z, X) & Ancestor(Z, Y))

# Function to add new family members
def add_parent_child(parent, child):
    + Parent(parent, child)
    print(f"Added parent-child relationship: {parent} -> {child}")

# Query function to retrieve family relationships
def query_family():
    print("Sibling relationships:")
    print(Sibling(X, Y).data)

    print("Grandparent relationships:")
    print(Grandparent(X, Y).data)

    print("Ancestor relationships:")
    print(Ancestor(X, Y).data)

    print("Degrees of relationship:")
    print(Relationship(X, Y, Degree).data)

    print("Common ancestors:")
    print(CommonAncestor(X, Y, Z).data)

# Example usage:
if __name__ == "__main__":
    query_family()

    # Add new family members dynamically
    add_parent_child('Carol', 'Emma')
    
    # Re-run the queries to show updated relationships
    query_family()
