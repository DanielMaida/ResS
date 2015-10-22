

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="collectorLayout">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../css/table-data.css">
</head>

<body>
<div id="page-content-wrapper">

    <div id ="collectionHistory">
        <table>
            <thead>
            <tr>
                <th>Data</th>
                <th>Quantidade</th>
                <th>Ponto</th>

            </tr>
            </thead>
            <tbody>
            <g:if test="${closedPickups.size() == 0}" >
                <tr>
                    <td colspan="3" style="text-align: center;">Você não realizou nenhuma coleta até agora</td>
                </tr>
            </g:if>
            <g:else>
                <g:each var="pickup" in="${closedPickups}">
                    <tr>
                        <td>
                            ${pickup.date.dateTimeString}
                        </td>
                        <td>
                            ${pickup.residueAmount + " litros"}
                        </td>
                        <td>
                            ${pickup.generator.name}
                        </td>

                    </tr>
                </g:each>
            </g:else>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>