$newFiles = "C:\Users\1025032\Documents\Excel"
$oldFiles = "C:\Users\1025032\Desktop\Java"

Get-ChildItem $newFiles | ForEach-Object {

    $currentFile = $_

    $oldFileLocation = Get-ChildItem -Recurse $oldFiles | Where-Object { $_ -Match "$currentFile"} | Select-Object -ExpandProperty DirectoryName

    if($oldFileLocation) {   # if this variable is not null, we've found original file location
        Write-Host "found file [$currentFile] in location: [$oldFileLocation]. overwriting the original."
        Copy-Item -Path $newFiles\$currentFile -Destination $oldFileLocation -Force
    }
    else {
        Write-Warning "could not find file [$currentFile] in location [$oldFiles]."
    }

}