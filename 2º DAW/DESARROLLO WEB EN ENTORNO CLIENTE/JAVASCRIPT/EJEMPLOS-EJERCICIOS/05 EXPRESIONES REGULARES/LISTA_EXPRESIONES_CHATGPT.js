const regexList = [
    {
      description: "Validar email (soporta subdominios y dominios complejos)",
      regex: /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/,
      example: "user.name+tag@example.subdomain.com"
    },
    {
      description: "Validar número de teléfono (formato internacional con prefijo opcional)",
      regex: /^\+?(\d{1,3})?[-.\s]?\(?\d{1,4}\)?[-.\s]?\d{1,4}[-.\s]?\d{1,9}$/,
      example: "+34 912-345-678"
    },
    {
      description: "Validar tarjeta de crédito (Visa, MasterCard, AMEX, etc.)",
      regex: /^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|3[47][0-9]{13}|6(?:011|5[0-9]{2})[0-9]{12})$/,
      example: "4111111111111111" // Ejemplo Visa
    },
    {
      description: "Validar contraseña (mínimo 8 caracteres, mayúsculas, minúsculas, números, y un símbolo)",
      regex: /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/,
      example: "StrongP@ss1"
    },
    {
      description: "Validar DNI/NIE español (letras y números válidos)",
      regex: /^[XYZ]?\d{7,8}[A-Z]$/,
      example: "12345678Z"
    },
    {
      description: "Validar código postal internacional (5-9 dígitos con separadores opcionales)",
      regex: /^\d{5}(-\d{4})?$/,
      example: "12345-6789"
    },
    {
      description: "Validar nombre completo (letras con acentos y espacios, longitud mínima 2 palabras)",
      regex: /^[A-Za-zÀ-ÿ]+(?:\s[A-Za-zÀ-ÿ]+)+$/,
      example: "José María López"
    },
    {
      description: "Validar URL (incluye protocolo y puertos opcionales)",
      regex: /^(https?:\/\/)?(www\.)?[a-zA-Z0-9-]+(\.[a-zA-Z]+)+(\/[\w.-]*)*(:\d{1,5})?$/,
      example: "https://www.example.com:8080/path"
    },
    {
      description: "Validar fecha (formato DD/MM/AAAA con validación básica de días y meses)",
      regex: /^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/(19|20)\d{2}$/,
      example: "31/12/2024"
    },
    {
      description: "Validar hora (formato HH:MM:SS en 24 horas)",
      regex: /^([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$/,
      example: "23:59:59"
    },
    {
      description: "Validar número hexadecimal (0x seguido de 1 a 8 caracteres hexadecimales)",
      regex: /^0x[0-9A-Fa-f]{1,8}$/,
      example: "0x1A3F"
    },
    {
      description: "Validar matrícula de coche español (formato actual de 4 dígitos y 3 letras)",
      regex: /^\d{4}[A-Z]{3}$/,
      example: "1234XYZ"
    },
    {
      description: "Validar IBAN (formato estándar con prefijo de 2 letras y 20-34 caracteres alfanuméricos)",
      regex: /^[A-Z]{2}\d{2}[A-Z0-9]{1,30}$/,
      example: "ES9121000418450200051332"
    },
    {
      description: "Validar código de color hexadecimal (incluye # y 3 o 6 caracteres hexadecimales)",
      regex: /^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$/,
      example: "#1A2B3C"
    },
    {
      description: "Validar números binarios (secuencias de 0 y 1, mínimo 4 caracteres)",
      regex: /^[01]{4,}$/,
      example: "11001010"
    },
    {
      description: "Validar moneda en formato decimal (opcionalmente con símbolo $ o €)",
      regex: /^[€$]?\d+(\.\d{1,2})?$/,
      example: "€1234.56"
    },
    {
      description: "Validar nombre de usuario (de 5 a 20 caracteres, alfanumérico con guion bajo permitido)",
      regex: /^[a-zA-Z0-9_]{5,20}$/,
      example: "user_name123"
    },
    {
      description: "Validar dirección IP (IPv4 con validación estricta de rangos)",
      regex: /^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){2}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/,
      example: "192.168.0.1"
    },
    {
      description: "Validar fecha en formato ISO 8601 (AAAA-MM-DD)",
      regex: /^\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$/,
      example: "2024-11-19"
    },
    {
      description: "Validar secuencia de letras y números (mínimo 3 letras seguidas de 2 números consecutivos)",
      regex: /^[A-Za-z]{3,}\d{2,}$/,
      example: "abc123"
    }
  ];
  
  // Función para probar las expresiones regulares
  function testRegex(input, regex, description) {
    if (regex.test(input)) {
      console.log(`✅ ${description}: ${input} es válido.`);
    } else {
      console.log(`❌ ${description}: ${input} no es válido.`);
    }
  }
  
  // Ejemplo de prueba de todas las expresiones regulares
  regexList.forEach((item) => {
    testRegex(item.example, item.regex, item.description);
  });
  