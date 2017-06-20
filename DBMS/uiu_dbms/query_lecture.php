<?php
/**
 * Created by PhpStorm.
 * User: akashs
 * Date: 6/20/17
 * Time: 10:48 AM
 */


$conn = mysqli_connect("localhost", "root", "password", "dbms_lab");

if($conn->connect_errno > 0){
    die("Unable to connect: ". $conn->connect_error);
}

$query = "SELECT * FROM user";
$result = $conn->query($query);

$res = "";
while($row = $result->fetch_assoc()){
    $res = $res . $row["userid"] . " ". $row["full_name"]." "
        . $row["email"]."</br>";
}

echo $res;

?>
