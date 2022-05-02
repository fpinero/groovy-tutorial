class Maps {
    static void main(String[] args){

        def paulMap = [
                'name' : 'Paul',
                'age' : 35,
                'address' : '123 Main St',
                'list' : [1,2,3]
        ];
        println("paulMap =" + paulMap);

        // Access with key
        println("\nAccess with key");
        println("paulMap['name']");
        println("Name = " + paulMap['name']);
        println("paulMap.get('age')");
        println("Age = " + paulMap.get('age'));
        println("paulMap['list'][1]")
        println("List Item = " + paulMap['list'][1]);

        // Add key value
        println("\nAdd key value");
        println("paulMap.put('city', 'Pittsburgh')")
        paulMap.put('city', 'Pittsburgh');
        println("city = " + paulMap.get('city'));

        // Check for key
        println("\nCheck for key");
        println("paulMap.containsKey('city')");
        println("Has City " + paulMap.containsKey('city'));

        // Size
        println("\nSize");
        println("paulMap.size()")
        println("Size = " + paulMap.size());


    }
}
