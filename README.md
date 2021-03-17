# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 19-40-corrigindo-a-documentacao-dos-endpoints-de-cidades
git add .
git commit -m "Corrigindo a documentação dos endpoints de cidades"
git push origin 19-40-corrigindo-a-documentacao-dos-endpoints-de-cidades

git checkout master
git merge --no-ff 19-40-corrigindo-a-documentacao-dos-endpoints-de-cidades
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```